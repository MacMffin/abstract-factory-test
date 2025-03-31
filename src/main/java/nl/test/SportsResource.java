package nl.test;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import nl.test.model.annotations.Baseball;
import nl.test.model.annotations.Football;
import nl.test.model.interfaces.Ball;
import nl.test.model.interfaces.Pitch;
import nl.test.model.interfaces.SportsFactory;

@Path("/")
public class SportsResource {

    @Inject
    @Baseball
    SportsFactory baseballFactory;

    @Inject
    @Football
    SportsFactory footballFactory;

    @Path("football")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String footballResponse() {
        Ball ball = footballFactory.createBall();
        Pitch pitch = footballFactory.createPitch();

        ball.printBallColour();
        pitch.printFieldSize();

        return "The ball is %s and the pitch is %s".formatted(ball.getBallName(), pitch.getFieldShape());
    }

    @Path("baseball")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String baseballResponse() {
        Ball ball = baseballFactory.createBall();
        Pitch pitch = baseballFactory.createPitch();

        ball.printBallColour();
        pitch.printFieldSize();

        return "The ball is %s and the pitch is %s".formatted(ball.getBallName(), pitch.getFieldShape());
    }
}

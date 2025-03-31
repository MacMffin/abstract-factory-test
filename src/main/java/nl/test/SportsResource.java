package nl.test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import nl.test.model.impl.BaseballFactory;
import nl.test.model.impl.FootballFactory;
import nl.test.model.interfaces.Ball;
import nl.test.model.interfaces.Pitch;
import nl.test.model.interfaces.SportsFactory;

@Path("/")
public class SportsResource {

    @Path("football")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String footballResponse() {
        SportsFactory factory = new FootballFactory();
        Ball ball = factory.createBall();
        Pitch pitch = factory.createPitch();

        ball.printBallColour();
        pitch.printFieldSize();
        return "The ball is %s and the pitch is %s".formatted(ball.getBallName(), pitch.getFieldShape());
    }

    @Path("baseball")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String baseballResponse() {
        SportsFactory factory = new BaseballFactory();
        Ball ball = factory.createBall();
        Pitch pitch = factory.createPitch();

        ball.printBallColour();
        pitch.printFieldSize();
        return "The ball is %s and the pitch is %s".formatted(ball.getBallName(), pitch.getFieldShape());
    }
}

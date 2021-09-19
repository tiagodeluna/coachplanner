package com.tiagodeluna.coachplanner.controller;

import com.tiagodeluna.coachplanner.domain.Constants;
import com.tiagodeluna.coachplanner.domain.Training;
import com.tiagodeluna.coachplanner.persistence.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/trainings")
public class TrainingController {

    @Autowired
    private TrainingRepository trainingRepository;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTraining(@RequestParam("type") String type, @RequestBody Training training) {
        switch (type) {
            case Constants.COURSE:

        }

        Training trainingDb = trainingRepository.save(training);
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Training> getTrainings(@PathParam("type") String type) {
        List<Training> trainingList = new ArrayList<>();
        if (type == null) {
            trainingList = trainingRepository.findAll();
        } else {
            // TODO Filter by type
            //trainingList = trainingRepository.findAll(new Workshop());
        }

        return trainingList;
    }
}

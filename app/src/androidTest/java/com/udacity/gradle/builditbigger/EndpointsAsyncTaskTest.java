package com.udacity.gradle.builditbigger;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class EndpointsAsyncTaskTest implements EndpointsAsyncTask.OnEventListener {

    @Test
    public void getAJoke_ReceiveNull_IfThereIsNoJoke() {

        try{
            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(this);
            endpointsAsyncTask.execute();

            String asyncTaskResult = endpointsAsyncTask.get(10, TimeUnit.SECONDS);
            assertNotNull(asyncTaskResult);
            assertTrue(asyncTaskResult.length() > 0);

        }catch(Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public void onSuccess(Object object) {

    }

    @Override
    public void onFailure(Exception e) {

    }
}
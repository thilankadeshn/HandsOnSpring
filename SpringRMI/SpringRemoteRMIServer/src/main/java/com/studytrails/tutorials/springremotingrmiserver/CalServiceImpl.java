package com.studytrails.tutorials.springremotingrmiserver;

/**
 * Created by thilanka on 12/15/15.
 */
public class CalServiceImpl implements CalService {

    @Override
    public Integer getSum(Integer a,Integer b){
        return a+b;
    }

}

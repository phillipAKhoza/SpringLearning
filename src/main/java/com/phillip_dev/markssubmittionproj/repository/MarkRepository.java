package com.phillip_dev.markssubmittionproj.repository;

import java.util.ArrayList;
import java.util.List;

import com.phillip_dev.markssubmittionproj.Mark;

public class MarkRepository {
   private List<Mark> studentMarks = new ArrayList<>();

   public Mark getMark(int index){
    return studentMarks.get(index);
   }

   public void addMark(Mark mark){
    studentMarks.add(mark);
   }
}

package com.phillip_dev.markssubmittionproj.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.phillip_dev.markssubmittionproj.Mark;
@Component
public class MarkRepository {
   private List<Mark> studentMarks = new ArrayList<>();

   public Mark getMark(int index){
    return studentMarks.get(index);
   }

   public void addMark(Mark mark){
    studentMarks.add(mark);
   }
   public void updateMark(int index, Mark mark){
    studentMarks.set(index, mark);
   }
   public List<Mark> getMarks(){
    return studentMarks;
   }
}

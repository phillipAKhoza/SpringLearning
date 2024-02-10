package com.phillip_dev.markssubmittionproj.service;

import java.util.List;

import com.phillip_dev.markssubmittionproj.Constants;
import com.phillip_dev.markssubmittionproj.Mark;
import com.phillip_dev.markssubmittionproj.repository.MarkRepository;

public class MarkService {

    MarkRepository markRepository = new MarkRepository();

   public Mark getMark(int index){
     return markRepository.getMark(index);
   }

   public void addMark(Mark mark){
     markRepository.addMark(mark);;
   }
   public void updateMark(int index, Mark mark){
     markRepository.updateMark(index, mark);;
   }
   public List<Mark> getMarks(){
     return markRepository.getMarks();
   }    
    // this is a methode that checks if data exists. we iterate on the array list and compare the ids and if the id is fount we return it
    // if the id is not found we return a 404 constatnt

   public int getMarkIndex(String id){

    for(int i =0; i < getMarks().size(); i++ ){
            if(getMarks().get(i).getId().equals(id)) return i;
        }
        return Constants.NOT_FOUND;
   }
    //  the method we check if the data exists or not if it exist we sent the data to the form
    // if the data doesnt exit we create a new mark object
   public Mark getMarkById(String id){
    int index = getMarkIndex(id);
        return index == Constants.NOT_FOUND ? new Mark() : getMark(index);
   }

   public void submitMark(Mark mark){
    int index = getMarkIndex(mark.getId());
    // first you need to check if the data being submitted exits or not and we check that via a getMarkIndex method
    // if the data exits we update .set if not we add .add
    if(index == Constants.NOT_FOUND){
        addMark(mark);
    }else{
        updateMark(index, mark);
    }
   }
}

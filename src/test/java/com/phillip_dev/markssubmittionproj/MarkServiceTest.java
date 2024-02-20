package com.phillip_dev.markssubmittionproj;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.phillip_dev.markssubmittionproj.repository.MarkRepository;
import com.phillip_dev.markssubmittionproj.service.MarkService;

@RunWith(MockitoJUnitRunner.class)
public class MarkServiceTest {
    
    @Mock
    private MarkRepository markRepository;

    @InjectMocks
    private MarkService markService;

    @Test
    public void getMarksFromRepoTest(){
        when(markRepository.getMarks()).thenReturn(Arrays.asList(
            new Mark("Phillip", "OOP", 90),
            new Mark("Nkateko", "DSO", 80)
        ));

        List<Mark> result = markService.getMarks();

        assertEquals("Phillip", result.get(0).getName());
        assertEquals("DSO", result.get(1).getSubject());
    }
}

package com.phillip_dev.markssubmittionproj;

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
}

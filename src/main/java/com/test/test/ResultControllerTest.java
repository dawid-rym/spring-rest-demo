package com.test.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import com.test.main.ResultController;
import com.test.main.data.InvalidDataException;
import com.test.main.data.Result;

@RunWith(JUnit4.class)
public class ResultControllerTest {

  private ResultController resultController = new ResultController();

  @Test
  public void addTwoDigits_validInput() {
    double firstDigit = 1.23;
    double secondDigit = 1.23;

    Result addingResult = resultController.addTwoDigits(firstDigit, secondDigit);

    Assert.assertTrue(addingResult.getValue() == firstDigit + secondDigit);
  }

  @Test
  public void divideTwoDigits_validInput() {
    Result addingResult = resultController.divideTwoDigits(4.0, 2.0);

    Assert.assertTrue(addingResult.getValue() == 2.0);
  }

  @Test(expected = InvalidDataException.class)
  public void divideTwoDigits_invalidInputDivideByZero() {
    resultController.divideTwoDigits(1.23, 0);
  }
}

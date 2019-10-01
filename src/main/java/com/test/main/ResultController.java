package com.test.main;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.main.data.InvalidDataException;
import com.test.main.data.Result;

@RestController
@RequestMapping("/result")
public class ResultController {

  @PostMapping("/add/{firstDigit}/{secondDigit}")
  public Result addTwoDigits(@PathVariable double firstDigit, @PathVariable double secondDigit) {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    String formattedResult = decimalFormat.format(firstDigit + secondDigit);

    try {
      return new Result(NumberFormat.getInstance().parse(formattedResult).doubleValue());
    } catch (ParseException e) {
      throw new InvalidDataException(
          String.format("The result cannot be parsed using provided digits: '%s' and '%s'.",
              firstDigit, secondDigit));
    }
  }

  @GetMapping("/div/{firstDigit}/{secondDigit}")
  public Result divideTwoDigits(@PathVariable double firstDigit, @PathVariable double secondDigit)
      throws InvalidDataException {
    if (secondDigit == 0) {
      throw new InvalidDataException("Cannot divide by zero.");
    }

    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    String formattedResult = decimalFormat.format(firstDigit / secondDigit);

    try {
      return new Result(NumberFormat.getInstance().parse(formattedResult).doubleValue());
    } catch (ParseException e) {
      throw new InvalidDataException(
          String.format("The result cannot be parsed using provided digits: '%s' and '%s'.",
              firstDigit, secondDigit));
    }
  }
}

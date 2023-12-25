package com.bootcoding.User_Command_Calculator.calculatorCommand;

import com.bootcoding.User_Command_Calculator.model.Result;

public interface Command {

    public Result execute(String[] attributes) throws Exception;
}

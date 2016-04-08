package com.command;
    public class Invoker {   
      private Command command;   
      public void setOrder(Command command) {   
      this.command = command;   
      }   
      public void ExecuteCommand() {   
          command.ExecuteCommand();   
    }   
}   
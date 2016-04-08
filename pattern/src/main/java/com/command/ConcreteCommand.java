package com.command;
    public class ConcreteCommand extends Command {   
    public ConcreteCommand(Receiver receiver){   
      super(receiver);   
      }   
   @Override  
    public void ExecuteCommand() {   
        receiver.Execute();   
    }   
}   
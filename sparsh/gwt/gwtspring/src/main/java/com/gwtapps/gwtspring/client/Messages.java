package com.gwtapps.gwtspring.client;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	E:/Projects/Project_WorkSpace/gwtspring/src/main/resources/com/gwtapps/gwtspring/client/Messages.properties'.
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "Enter your name".
   * 
   * @return translated "Enter your name"
   */
  @DefaultMessage("Enter your name")
  @Key("nameField")
  String nameField();

  /**
   * Translated "Retrieve".
   * 
   * @return translated "Retrieve"
   */
  @DefaultMessage("Retrieve")
  @Key("retrieveButton")
  String retrieveButton();

  /**
   * Translated "SaveOrUpdate".
   * 
   * @return translated "SaveOrUpdate"
   */
  @DefaultMessage("SaveOrUpdate")
  @Key("saveOrUpdate")
  String saveOrUpdate();

  /**
   * Translated "Send".
   * 
   * @return translated "Send"
   */
  @DefaultMessage("Send")
  @Key("sendButton")
  String sendButton();
}

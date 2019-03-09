package pom.appliedprograming.springboot.Topic;

import org.springframework.boot.SpringApplication;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Topic{
	
	public static void main(String[] args) {
		
			SpringApplication.run(Topic.class, args);
	}
	
 private String id;
 private String name;
 private String description;
 
 @JsonCreator
 public Topic(@JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("description") String description) {
  super();
  this.id = id;
  this.name = name;
  this.description = description;
 }
 
 public String getId() {
  return id;
 }
 public void setId(String id) {
  this.id = id;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getDescription() {
  return description;
 }
 public void setDescription(String description) {
  this.description = description;
 }
}
# Advanced Spring: Spring Boot Actuator
This is the repository for the LinkedIn Learning course Advanced Spring: Spring Boot Actuator. The full course is available from [LinkedIn Learning][lil-course-url].

![Advanced Spring: Spring Boot Actuator][lil-thumbnail-url] 

Are you a Java developer with a need to monitor the performance of your applications? In this advanced course, award-winning technical instructor Mikaila Akeredolu gives you an overview of the dashboard that you build in this course using Spring Boot Actuator, Prometheus, and Grafana. Then he dives into specifics. Mikaila introduces you to monitoring and managing Spring Boot applications with Spring Boot Actuator. He explains endpoints, endpoint groups, and how to override the Actuator base path. Mikaila walks you through the process to create and secure endpoints, then shows you how to leverage Micrometer and Prometheus to store and query metrics from your applications. Mikaila finishes up with a detailed discussion of Grafana dashboards, which make it easier to visualize multiple metrics across multiple stacks on the same screen.

## Instructions
This repository has branches for each of the videos in the course. You can use the branch pop up menu in github to switch to a specific branch and take a look at the course at that stage, or you can add `/tree/BRANCH_NAME` to the URL to go to the branch you want to access.

## Branches
The branches are structured to correspond to the videos in the course. The naming convention is `CHAPTER#_MOVIE#`. As an example, the branch named `02_03` corresponds to the second chapter and the third video in that chapter. 
Some branches will have a beginning and an end state. These are marked with the letters `b` for "beginning" and `e` for "end". The `b` branch contains the code as it is at the beginning of the movie. The `e` branch contains the code as it is at the end of the movie. The `main` branch holds the final state of the code when in the course.

When switching from one exercise files branch to the next after making changes to the files, you may get a message like this:

    error: Your local changes to the following files would be overwritten by checkout:        [files]
    Please commit your changes or stash them before you switch branches.
    Aborting

To resolve this issue:
	
    Add changes to git using this command: git add .
	Commit changes using this command: git commit -m "some message"

## Installing
1. To use these exercise files, you must have the following installed:
	- [list of requirements for course]
2. Clone this repository into your local machine using the terminal (Mac), CMD (Windows), or a GUI tool like SourceTree.
3. [Course-specific instructions]


### Instructor

Mikaila Akeredolu 
                            


                            

Check out my other courses on [LinkedIn Learning](https://www.linkedin.com/learning/instructors/mikaila-akeredolu).

[lil-course-url]: https://www.linkedin.com/learning/advanced-spring-spring-boot-actuator
[lil-thumbnail-url]: https://cdn.lynda.com/course/3010189/3010189-1643410165052-16x9.jpg

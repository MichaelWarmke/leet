

# Introduction

Hi im Mike Warmke, and I have been a professional software developer for a little under 4 years now.
I have spent that time at JPMorgan where I worked on the same project.
With in the project we maintain multiple service that are a part of the overall Custody Application for JPMC
All of those applications are written in Java, and use a lot of the standard tools in that ecosystem
like mvn, spring, spring data jpa... etc
All the Applications that I worked on were solely backend applications, without any ui
a couple were small REST Services, and one was a large event driven application

My education is in Computer engineering, and was much more focused on the hardware side of things.
During my senior design project, I had the chance to work on the more embedded software side of our project.
I really liked the software side of things. Just how big the world of software was, and how much i did not know about it.
Software also seemed to have a lot more opportunities.

These were Event Driven Applications that were a part of a bigger application used for custody trade processing.
The Application used a message bus called AMPS to communicate with other core systems.
And made REST Service calls to other ref data applications

one of our big project this year was moving our applications to private cloud instance that is a Kubernetes as a Service offering
We had to redesign a large portion of our application to compatable with the move to cloud
So i have experience with Docker, and Kubernetes. I do have a CKAD cert as well

As far as databases go, I have experience with Oracle DB

# Dealing with conflict

- Dave Deal Id
  - S there was an argument happening over a certain id that would come over events to our application, 
      in our application we were overriding this value, and one of the other teams took issue with this
  - T figure out whether there was any validity to their claim
  - A reviewed the whole situation with my boss to determine the best course of action
  - R in the end the alternative point of view was taken 

- Russel Code Reviews
  - S there was a dev on my team that was difficult to 
  - T merge the code
  - A sat down with him over the course of a day, to go over the improvement/suggestions
  - R I ended up implementing many of his suggestions in my pul request,
      and some of them we agreed that they were not needed

# Most Challenging Task

- Migrating to a new codebase design
  - S previous team member had started a migration from an older Disrupter based framework to a plain old java app
  - T complete the migration, and test that all the requirements are still being met
  - A setup old flow under the new architecture, and implemented the changes required to meet requirements of the cucumber tests
      also did a performance testing and recon on the two different applications once development was done
  - R the older flow was successfully migrated with minimal issue

- Migration of Application Services to Cloud infrastructure
  - S this year all of our application had to migrated to an internally hosted mutli-tenant kubernetes cluster
  - T come up with designs for all Applications that will be compatible with the cloud infrastructure,
      as well as implement some of these designs for our larger application.
  - A Identified feature of our applications that would need to be redesigned. 
      came up with design proposals for these issues, and worked with cloud SME teams to refine the designs.
      worked with other members of my teams to implement some of these features. 
      created tools for functional testing and performance testing of old vs new infra
  - R all the applications were migrated successfully with minor issue

# Dealing With Negative Feedback
 
- IMOS feedback on penalties
  - S during that build we did for the other system, I received negative feedback on how dependencies were made
  - T reimplement dependencies between our flow and theirs
  - A done the above
  - R code got stamp of approval from both teams
- Russel Code Reviews
- Dave Deal id

# Cross Team Collaboration

- AME Penalties build
  - S One of our down stream applications needed help for a build on their service
  - T work with the other team to come up with the requirements, and implement it 
  - A worked with that team and another to adapt existing flow from another service to fit the needs of the build
  - R Implement feature with minimal issue in production

- platform in a box build
  - S application had very complex and time-consuming acceptence testing
  - T work with a group of people from other services to implement a testing platform that could be run locally
  - A made a testing module that could be integrated with the rest of the testing platform, 
      and worked with team to integrated into the platform
  - R new testing platform helped save the testing team many hours, through being able to test scenarios locally

# Mistake That You Have Made

- Passing Closure instead of new Object
  - S paged by PM for issues with inconsistent data, 
  - T find out the reason why this was happening, and push a fix for the issue
  - A after a few hours of looking through the code and testing,
      I identified the issue as a shared state bug, passing an enclosed object instead of a new one 
  - R push a fix for this bug the next day, and did not see any issue following

- Cloud migration oversight
  - S we had just migrated a major part of service on cloud, when our old processes came up after there scheduled restart period
  - T shutdown the old processes and remove any data that had been duplicated
  - A we shut down the old processes, then worked with all of our down stream systems to correct the data
  - R after a day worth of work on Sunday, all the data was corrected and the misses were fixed

# Why do you want to work here?

I really admire the ingenuity and dedication to good engineering practices that are found at Google.
I see a lot of developers that can aspire to be the best that they can be, work for Google, and I want to be a part of 
that culture that is constantly challenging you to become a better dev, and think outside the box.
I'm also very interested to work on projects that have the incredible scale that some of Google's product.
I'm interest to see what type of problems that team would be facing and working on, and what problems they have worked
through in the past.  

# why do you think you fit in with the company?


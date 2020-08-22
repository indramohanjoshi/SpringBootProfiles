# SpringBootProfiles
Demo of spring boot profiles

# Description
naming convention for multiple profiles are application-profilename.properties
- example application-dev.properties
  
# Activating profile
we can activate profile by setting below property into default application.properties file
- spring.profiles.active=dev
  
# Loading profile specific configuration
By using @Profile(<name of profile as string>) we can load profile specific configuration

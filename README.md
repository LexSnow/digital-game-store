# game-store
This simple backend app is used for browsing the store's catalogue of games. 
The app is a multi-module maven project that consists of a library and app modules. 
<h1>Library</h1>
<p>In the library module the general structure of the app has been stored, such as database entities,
exceptions, DTOs, mappers, service interfaces and repository layers of the spring boot app. 
In the resources folder along with the application.properties , there is a schema.sql file that
defines the schema of the h2 in-memory database. The data.sql inserts the dummy data used to
present the functionality of the app. Although repositories, services and exceptions have been defined for
all entities, only the Game entity has its dedicated controller. The mappers are
automatically generated using the map-struct maven dependency. They're used for
mapping DTOs to their POJO counterparts. The enum classes define the properties of
some entities and constrain the values that can be inserted into the database.</p>
<h1>App</h1>
<p>The main SpringBoot class is stored in the gamestore-app module. In this module
spring-security dependency has been added in order to secure the application using the
JWT token. The web security configuration has been defined in the config package.
A custom filter has been added to the security filter chain in order to authorize each
request with the JWT token. Two endpoints "/authenticate" used for generating the token
and "/h2-console/**" that lets the user access the h2-console. The url for the jdbc
db is generated on the console everytime the user starts the application. The CSRF attack
protection and the X-frame-options header has been disabled along with the password encoding.
A controller advice has been defined for the GameNotFoundException in order to display
404 status with a custom message.</p>
<h1>Authentication Controller</h1>
<p>The authentication controller as the name suggests is used for the user authentication.
Two dummy user has been defined: </p>
<p>User1</p>
'''json
{
"username" : "user@gmail.com",
"password" : "passwordUser"
}
'''
<p>User2</p>
'''json
{
"username" : "admin@gmail.com",
"password" : "passwordAdmin"
}
'''
<p>Sending a post request to the /authenticate endpoint with one of the json bodies defined
above gives us a JWT token that has to be provided in the "Authorization" header for
every request along with the "Bearer " prefix. User1 and User2 have different granted
authorities which give them access to different endpoints.</p>
<h1>Game Controller</h1>
<p>The game controller is a REST controller that serves the response in a json format.</p>
<p>Endpoints available for User1 and User2</p>
<p>GET - /game/games - Returns a List object of GameDTOs</p>
<p>GET - /game/games/{id} - Returns a specific GameDTO. Throws GameNotFoundException</p>
<p></p>
<p>Endpoints available for User2</p>
<p>POST - /game/admin - Creates new game. Sample json:</p>
'''json
{
"title" : "abc",
"releaseDate" : "2022-10-12",
"price" : 10,
"currency" : "PLN",
"gamePlatform" : "PC",
"genres" : ["ROLE_PLAYING"]
}
'''
<p>DELETE - /game/admin/{id} - Deletes a Game entity from db</p>
<p>PATCH - /game/admin/{id} - Updates the price and currency of the game. Sample json:</p>
'''json
{
"price" : 20,
"currency" : "PLN"
}
'''
<p>Simple integration tests have been provided within the test directory for UserRepository
and GameServiceImpl. The tests make use of JUNIT5, MOCKITO and ASSERTJ</p>
<h1>Final thoughts</h1>
<p>The app should have controllers for different entities. The JPA entities could be audited
with the Hibernate Envers. Logging with slf4j could be implemented.</p>

# Angular-Learning
Learning Angular from scratch with small tasks.

Contains: 

- Todo App
- Employee App
- Employee Manager

Usefull link to Angular CLI - https://angular.io/cli

# Most frequent Commands: 

Creates a new Angular project with the specified name.
  ```
 ng new <project-name>
  ```
Go to a project folder. (start typing the project name, then press TAB - it will fill the path correctly automatically)
  ```
 cd <project-name>
  ```
Builds and serves the Angular application locally for development purposes. It launches a development server and automatically reloads the application when changes are made.
  ```
ng serve
  ```
Generates different elements of an Angular application, such as components, services, modules, and more. Schematics are templates that help generate code quickly.
  ```
ng generate <schematic>
  ```
Builds the Angular application for production. It creates optimized bundles and prepares the app for deployment.
  ```
ng build
  ```
Runs unit tests for the Angular application using Karma and Jasmine. It helps ensure that the code behaves as expected.
  ```
ng test
  ```
Analyzes the code for potential errors, code style violations, and other issues using a linter like ESLint or TSLint.
  ```
ng lint
  ```
Updates the Angular dependencies and other packages used in the project to their latest versions. It helps keep the project up to date.
  ```
ng update
  ```
Adds a new package or library to the Angular project. It automatically installs and configures the package, making it ready for use.
  ```
ng add <package-name>
  ```
Deploys the Angular application to a hosting platform or a server for production use.
  ```
ng deploy
  ```
Displays help information and lists available commands and options provided by the Angular CLI.
  ```
ng help
  ```

# Most frequent ng generate Commands: 

Generates a new component file with the specified name. Components are the building blocks of an Angular application and represent different parts of the user interface.
  ```
ng generate component <component-name>
  ```
Creates a new service file with the specified name. Services are used to encapsulate reusable business logic, data retrieval, and other operations that can be shared across multiple components.
  ```
ng generate service <service-name>
  ```
Generates a new module file with the specified name. Modules help organize the application into logical units and provide a way to encapsulate related components, services, and other features.
  ```
ng generate module <module-name>
  ```
Creates a new directive file with the specified name. Directives allow you to extend the behavior of HTML elements or create reusable custom attributes.
  ```
ng generate directive <directive-name>
  ```
Generates a new pipe file with the specified name. Pipes are used to transform data in Angular templates, allowing you to format, filter, or manipulate the displayed values.
  ```
ng generate pipe <pipe-name>
  ```
Creates a new TypeScript class file with the specified name. Classes are commonly used to define models, data structures, or other reusable entities.
  ```
ng generate class <class-name>
  ```
Generates a new TypeScript interface file with the specified name. Interfaces define contracts for objects and provide a way to enforce a specific structure or shape of data.
  ```
ng generate interface <interface-name>
  ```
Creates a new TypeScript enumeration file with the specified name. Enums are used to define a set of named constants, making it easier to work with predefined values.
  ```
ng generate enum <enum-name>
  ```

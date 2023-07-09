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

# Common and Useful Angular Directives

Introduction
ngIf
ngFor
ngSwitch
ngStyle
ngClass
ngModel
Conclusion

1. Introduction<a name="introduction"></a>
Angular directives are a powerful feature that extends the functionality of HTML and enables developers to build dynamic and interactive web applications. In this README, we will explore some of the most common and useful Angular directives and learn how to use them effectively.

2. ngIf<a name="ngif"></a>
The ngIf directive is a structural directive that conditionally adds or removes an element from the DOM based on an expression. It is commonly used to control the visibility of elements based on certain conditions. Here's an example:

<div *ngIf="loggedIn">
  <p>Welcome, user!</p>
</div>

In the above example, the <div> element will be displayed only if the loggedIn variable evaluates to true.

3. ngFor<a name="ngfor"></a>
The ngFor directive is a structural directive used for iterating over a collection and generating HTML for each item. It is commonly used to render lists or tables based on data. Here's an example:

<ul>
  <li *ngFor="let item of items">{{ item }}</li>
</ul>

In the above example, each item in the items array will be rendered as an <li> element within the <ul> list.

4. ngSwitch<a name="ngswitch"></a>
The ngSwitch directive is a structural directive used for conditionally rendering elements based on a given value. It allows you to define multiple cases and display different content based on the evaluated expression. Here's an example:

<div [ngSwitch]="status">
  <p *ngSwitchCase="'success'">Operation successful!</p>
  <p *ngSwitchCase="'error'">An error occurred.</p>
  <p *ngSwitchDefault>Unknown status.</p>
</div>

In the above example, the content of the <div> will change based on the value of the status variable.

5. ngStyle<a name="ngstyle"></a>
The ngStyle directive is an attribute directive used to apply inline styles to an element based on an expression. It allows you to dynamically set CSS styles based on certain conditions or values. Here's an example:

<p [ngStyle]="{ color: isActive ? 'green' : 'red', 'font-size.px': fontSize }">
  Styled Text
</p>

In the above example, the color and font size of the <p> element will be dynamically determined based on the values of the isActive and fontSize variables.

6. ngClass<a name="ngclass"></a>
The ngClass directive is an attribute directive used to apply CSS classes to an element based on an expression. It allows you to conditionally add or remove CSS classes dynamically. Here's an example:

<p [ngClass]="{ 'highlight': isHighlighted, 'underline': isUnderlined }">
  Styled Text
</p>

In the above example, the highlight and underline CSS classes will be applied to the <p> element based on the values of the isHighlighted and isUnderlined variables.

7. ngModel<a name="ngmodel"></a>
The ngModel directive is used for two-way data binding between form inputs and component variables. It allows you to easily capture user input and update the component's state. Here's an example:

<input [(ngModel)]="name" placeholder="Enter your name" />
<p>Welcome, {{ name }}!</p>

In the above example, the value entered in the input field will be bound to the name variable, and any changes to the name variable will be reflected in the <p> element.

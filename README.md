# Use Vaadin in Next.js

WIP, use at your own risk.

## Usage

1. Ensure you have Node.js installed

2. Run `mvn` first time to install npm dependencies (then stop):

```sh
mvn
```

3. Run the server (this will run both Next.js via `next dev` and Vaadin via `mvn`)

```sh
npm run dev
```

4. Wait for Vaadin frontend compilation to complete

5. Open http://localhost:3000

6. Click the button

## Note

The following TypeScript check error can be ignored, app should work regardless:

```
[dev-server-output] INFO com.vaadin.base.devserver.DevServerOutputTracker - ERROR in frontend/generated/vaadin-featureflags.ts:2:1
[dev-server-output] INFO com.vaadin.base.devserver.DevServerOutputTracker - TS1208: 'vaadin-featureflags.ts' cannot be compiled under '--isolatedModules' because it is considered a global script file. Add an import, export, or an empty 'export {}' statement to make it a module.
[dev-server-output] INFO com.vaadin.base.devserver.DevServerOutputTracker -     1 | // @ts-nocheck
[dev-server-output] INFO com.vaadin.base.devserver.DevServerOutputTracker -   > 2 | window.Vaadin = window.Vaadin || {};
[dev-server-output] INFO com.vaadin.base.devserver.DevServerOutputTracker -       | ^^^^^^
[dev-server-output] INFO com.vaadin.base.devserver.DevServerOutputTracker -     3 | window.Vaadin.featureFlags = window.Vaadin.featureFlags || {};
[dev-server-output] INFO com.vaadin.base.devserver.DevServerOutputTracker -     4 | window.Vaadin.featureFlags.exampleFeatureFlag = false;
[dev-server-output] INFO com.vaadin.base.devserver.DevServerOutputTracker -     5 | window.Vaadin.featureFlags.viteForFrontendBuild = false;
```

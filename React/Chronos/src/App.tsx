import { HeadingComponent } from "./components/HeadingComponent";
import { ContainerComponent } from "./components/ContainerComponent";
import "./styles/global.css";
import "./styles/theme.css";

export function App() {
  return (
    <>
      <ContainerComponent>
        <HeadingComponent>LOGO</HeadingComponent>
      </ContainerComponent>
      <ContainerComponent>
        <HeadingComponent>MENU</HeadingComponent>
      </ContainerComponent>
      <ContainerComponent>
        <HeadingComponent>FORM</HeadingComponent>
      </ContainerComponent>
      <ContainerComponent>
        <HeadingComponent>FOOTER</HeadingComponent>
      </ContainerComponent>
    </>
  );
}

import { Container } from "./components/ContainerComponent";
import { Heading } from "./components/HeadingComponent";
import { Logo } from "./components/Logo";
import { Menu } from "./components/Menu";
import "./styles/global.css";
import "./styles/theme.css";

export function App() {
  return (
    <>
      <Container>
        <Logo />
      </Container>
      <Container>
        <Heading>
          <Menu />
        </Heading>
      </Container>
    </>
  );
}

import { HistoryIcon, HouseIcon, SettingsIcon, SunIcon } from "lucide-react";
import styles from "./styles.module.css";
import { Links } from "./MenuIconsComponent";
import { useEffect, useState } from "react";

type AvailableThemes = "dark" | "light";

export function Menu() {
  const [theme, setTheme] = useState<AvailableThemes>("dark");
  // Função para alternar entre os temas
  function handleThemeChange(
    event: React.MouseEvent<HTMLAnchorElement, MouseEvent> // Evitar o comportamento padrão do link
  ) {
    event.preventDefault(); // Previne o comportamento padrão do link

    // Alterna entre os temas. Se o tema atual for "dark", muda para "light" e vice-versa
    // O estado é atualizado com a função setTheme
    setTheme((prevTheme) => {
      const nextTheme = prevTheme === "dark" ? "light" : "dark";
      return nextTheme;
    });
  }
  // Efeito colateral para aplicar o tema no elemento HTML. O useEffect é chamado sempre que o tema muda
  // Isso garante que o tema correto seja aplicado quando o componente é montado
  useEffect(() => {
    document.documentElement.setAttribute("data-theme", theme); // Pega o elemento HTML e define o atributo "data-theme" com o valor do tema atual
  }, [theme]);

  return (
    <nav className={styles.menu}>
      <Links classe={styles.menuLink} ariaLabel="Home" title="Home">
        <HouseIcon />
      </Links>
      <Links classe={styles.menuLink} ariaLabel="Histórico" title="Histórico">
        <HistoryIcon />
      </Links>
      <Links
        classe={styles.menuLink}
        ariaLabel="Configurações"
        title="Configurações"
      >
        <SettingsIcon />
      </Links>
      <Links
        classe={styles.menuLink}
        ariaLabel="Tema"
        title="Tema"
        onClick={handleThemeChange}
        href="#"
      >
        <SunIcon />
      </Links>
    </nav>
  );
}

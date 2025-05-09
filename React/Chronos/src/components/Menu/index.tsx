import { HistoryIcon, HouseIcon, SettingsIcon, SunIcon } from "lucide-react";
import styles from "./styles.module.css";
import { Links } from "./MenuIconsComponent";
export function Menu() {
  return (
    <nav className={styles.menu}>
      <Links classe={styles.menuLink}>
        <HouseIcon />
      </Links>
      <Links classe={styles.menuLink}>
        <HistoryIcon />
      </Links>
      <Links classe={styles.menuLink}>
        <SettingsIcon />
      </Links>
      <Links classe={styles.menuLink}>
        <SunIcon />
      </Links>
    </nav>
  );
}

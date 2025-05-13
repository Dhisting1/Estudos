import styles from "./styles.module.css";

export function Footer() {
  return (
    <footer className={styles.footer}>
      <a href="#">Entenda como funciona a tecnica pomodoro 🍅</a>
      <a href="#">Chronos &copy; {new Date().getFullYear()} - Feito com 💚</a>
    </footer>
  );
}

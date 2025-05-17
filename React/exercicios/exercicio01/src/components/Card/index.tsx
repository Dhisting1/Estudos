import styles from "./styles.module.css";

type CardProps = {
  children: React.ReactNode;
  title?: string;
};

export function Card({ children, title }: CardProps) {
  return (
    <div className={styles.card}>
      <div title={title}>{children}</div>
    </div>
  );
}

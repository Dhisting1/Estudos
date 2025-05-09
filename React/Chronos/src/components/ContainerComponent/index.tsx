import styles from "./styles.module.css";

type ContainerComponentProps = {
  children: React.ReactNode;
};

export function ContainerComponent({ children }: ContainerComponentProps) {
  return (
    <div className={styles.container}>
      <div className={styles.content}>{children}</div>
    </div>
  );
}

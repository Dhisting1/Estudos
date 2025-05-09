import type React from "react";
import styles from "./styles.module.css";

type HeadingComponentProps = {
  children: React.ReactNode;
};

export function HeadingComponent({ children }: HeadingComponentProps) {
  return <h1 className={styles.heading}>{children}</h1>;
}

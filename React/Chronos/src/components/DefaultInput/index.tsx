import type React from "react";
import styles from "./styles.module.css";

type DefaultInputProps = {
  id: string;
  labelText: string;
} & React.ComponentProps<"input">;

export function DefaultInput({
  id,
  labelText,
  type,
  ...rest
}: DefaultInputProps) {
  return (
    <>
      <label htmlFor={id}>{labelText}</label>
      <input className={styles.input} type={type} name="" id={id} {...rest} />
    </>
  );
}

import { useState } from "react";

export function Contador() {
  const [contador, setContador] = useState(0);
  const handleSomar = () => {
    setContador(contador + 1);
  };
  const handleSubtrair = () => {
    setContador((prevState) => (prevState > 0 ? prevState - 1 : 0));
  };
  return (
    <>
      <h1>Contador</h1>
      <p>{contador}</p>
      <button onClick={handleSomar}>Somar</button>
      <button onClick={handleSubtrair}>Subtrair</button>
    </>
  );
}

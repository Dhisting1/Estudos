import { useEffect, useState } from "react";

export function Clock() {
  const [time, setTime] = useState(new Date()); // UseState para guardar o tempo atual

  useEffect(() => {
    // UseEffect para atualizar o componente a cada segundo
    // O useEffect é chamado quando o componente é montado e quando o estado muda
    const interval = setInterval(() => {
      // setInterval para atualizar o tempo a cada segundo
      setTime(new Date());
    }, 1000);

    return () => {
      clearInterval(interval); // Limpa o intervalo quando o componente é desmontado
    };
  }, []);

  const horas = time.getHours(); // Pega as horas do objeto Date
  const minutos = time.getMinutes(); // Pega os minutos do objeto Date
  const segundos = time.getSeconds(); // Pega os segundos do objeto Date
  return (
    <>
      <h1>Clock</h1>
      <p>{`${horas} : ${minutos} : ${segundos}`}</p>{" "}
      {/* Exibe o tempo atual formatado */}
    </>
  );
}

import "./styles/App.css";
import { Card } from "./components/Card";
import { Contador } from "./components/Contador";
import { Clock } from "./components/Clock";

function App() {
  return (
    <>
      <Card title="Card Title">
        <Contador />
      </Card>
      <Card>
        <Clock />
      </Card>
    </>
  );
}

export default App;

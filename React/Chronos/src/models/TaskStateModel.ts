import type { TaskModel } from "./TaskModel"

export type TaskStateModel = {
  tasks: TaskModel[]; // histórico, MainForm
  secondsRemaining: number; //Home, CountDown, Histórico, MainForm, Button
  formattedSecondsRemaining: string; //Titulo, CountDown
  activeTask: TaskModel | null; //CountDown, Histórico, MainForm, Button
  currentCycle: number; // 1 a 8 | Home
  config: {
    workTime: number; //MainForm
    shortBreakTime: number; //MainForm
    longBreakTime: number; //MainForm
  }
}
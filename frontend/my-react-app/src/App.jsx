import { useState } from 'react'
import viteLogo from '/vite.svg'
import './App.css'
import Hello from './components/Hello.jsx'

function App() {
  const [name, setName] = useState("")
  const [noteBookName, setNoteBookName] = useState("")
  return (
    <>
      <input
        placeholder="Nome da pessoa"
        value={name}
        onChange={(e) => setName(e.target.value)}
      />
      <Hello 
        noteBookName={noteBookName}
        setNoteBookName={setNoteBookName}
      />
      <p> O(A) {name} comprou o caderno {noteBookName} </p>
    </>
    
)
}
export default App

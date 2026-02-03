import { useState } from 'react'

function Hello(props) {

    return (
        <input
        placeholder="Nome do Caderno"
        value={props.noteBookName}
        onChange={(e) => props.setNoteBookName(e.target.value)}
        />
    )
}

export default Hello;
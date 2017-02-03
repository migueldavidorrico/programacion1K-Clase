package multimedia;

public enum Formato {
	WAV(TipoFormato.AUDIO), MP3(TipoFormato.AUDIO), MIDI(TipoFormato.AUDIO), AVI(TipoFormato.VIDEO), MOV(
			TipoFormato.VIDEO), MPG(TipoFormato.VIDEO), CDAUDIO(TipoFormato.AUDIO), DVD(TipoFormato.VIDEO);

	TipoFormato tipoFormato;

	Formato(TipoFormato tipoFormato) {
		this.tipoFormato = tipoFormato;
	}

	@Override
	public String toString() {
		return this.name().toLowerCase();
	}

	public TipoFormato getTipoFormato() {
		return this.tipoFormato;
	}

}

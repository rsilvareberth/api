package wipdev.cloud.api.rest.response;

import javax.annotation.Generated;

public class Response {
	
	private String descricao;

	private Response(Builder builder) {
		this.descricao = builder.descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static Builder newResponse() {
		return new Builder();
	}
	public static final class Builder {
		private String descricao;

		private Builder() {
		}

		public Builder withDescricao(String descricao) {
			this.descricao = descricao;
			return this;
		}

		public Response build() {
			return new Response(this);
		}
	}
	
	

}

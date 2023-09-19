FROM ubuntu:latest
LABEL authors="xcolo"

ENTRYPOINT ["top", "-b"]
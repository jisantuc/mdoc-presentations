# `mdoc-presentations`

This repository holds presentations made with [`mdoc`]. 

## Slides

All slides will be available under https://jisantuc.github.io/mdoc-presentations. The landing page is
a super boring non-styled HTML list but it will take you where you need to go.

## Building

Presentations will be separated into sbt modules. Right now, the only modules are `decline-for-ciris` and `byo-web-token`.
To build a presentation, you can run, e.g., `sbt decline-for-ciris/mdoc` if you have `sbt` available locally.
Alternatively, if you're a nix user, you can run `nix-shell --run 'sbt ~decline-for-ciris/mdoc'`.
This command will start `mdoc` running in watch mode, so any changes you make to `decline-for-ciris/mdoc/index.html`
will get built into `decline-for-ciris/docs/index.html`.

You can run a simple web server in `decline-for-ciris/docs` with `python3 -m http.server` or whatever filesystem
server you want to run, then you can hit `localhost:8000` (if you used python3) in a browser to view the slides.

### How to publish slides with github

Publication happens through the `publish.yml` GitHub action. It's basically `scripts/docs` +
a GitHub pages publication action.

This project was generated using [Giter8][g8] with template [presentation.g8][presentation.g8]

[g8]: http://www.foundweekends.org/giter8/
[presentation.g8]: https://github.com/julien-truffaut/presentation.g8
[`mdoc`]: https://scalameta.org/mdoc/

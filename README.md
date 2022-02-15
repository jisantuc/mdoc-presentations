# `mdoc-presentations`

This repository holds presentations made with [`mdoc`]. 

## Slides

No publication set up yet, maybe someday

## Building

Presentations will be separated into sbt modules. Right now, the only module is `decline-for-ciris`. To build the presentation, you can run `sbt decline-for-ciris/mdoc` if you have `sbt` available locally. Alternatively, if you're a nix user, you can run `nix-shell --run 'sbt ~decline-for-ciris/mdoc'`. This command will start `mdoc` running in watch mode, so any changes you make to `decline-for-ciris/mdoc/index.html` will get built into `decline-for-ciris/docs/index.html`.

### How to publish slides with github

When you are ready push the repository to github (including the compiled slides in `docs`).
Then go to project settings -> GitHub Pages and select `master branch /docs folder` for 
the source of github pages.

This project was generated using [Giter8][g8] with template [presentation.g8][presentation.g8]


[g8]: http://www.foundweekends.org/giter8/
[presentation.g8]: https://github.com/julien-truffaut/presentation.g8
[`mdoc`]: https://scalameta.org/mdoc/

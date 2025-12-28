.class public interface abstract LW/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic b(LW/o;LW/C;)V
    .locals 1

    const/4 v0, 0x1

    invoke-interface {p0, p1, v0}, LW/o;->j(LW/C;I)V

    return-void
.end method

.method public static g(LW/o;LV/d;)V
    .locals 6

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, p1, LV/d;->a:F

    iget v4, p1, LV/d;->d:F

    iget v2, p1, LV/d;->b:F

    iget v3, p1, LV/d;->c:F

    const/4 v5, 0x1

    move-object v0, p0

    invoke-interface/range {v0 .. v5}, LW/o;->n(FFFFI)V

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract c(FF)V
.end method

.method public abstract d()V
.end method

.method public abstract e()V
.end method

.method public abstract f(FFFFFFLW/g;)V
.end method

.method public abstract h(LW/C;LW/g;)V
.end method

.method public abstract i(FJLW/g;)V
.end method

.method public abstract j(LW/C;I)V
.end method

.method public abstract k([F)V
.end method

.method public abstract l(LW/f;JJJJLW/g;)V
.end method

.method public abstract m()V
.end method

.method public abstract n(FFFFI)V
.end method

.method public abstract o(FF)V
.end method

.method public abstract p(FFFFLW/g;)V
.end method

.method public abstract q(LV/d;LW/g;)V
.end method

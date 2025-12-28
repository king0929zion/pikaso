.class public final LA2/n;
.super Ly2/a;
.source "SourceFile"

# interfaces
.implements LA2/o;
.implements LA2/f;


# instance fields
.field public final g:LA2/b;


# direct methods
.method public constructor <init>(Lg2/i;LA2/b;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Ly2/a;-><init>(Lg2/i;Z)V

    iput-object p2, p0, LA2/n;->g:LA2/b;

    return-void
.end method


# virtual methods
.method public final B(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, LA2/n;->g:LA2/b;

    invoke-virtual {v1, p1, v0}, LA2/b;->g(Ljava/lang/Throwable;Z)Z

    invoke-virtual {p0, p1}, Ly2/b0;->A(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    invoke-virtual {p0}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ly2/m;

    if-nez v1, :cond_2

    instance-of v1, v0, Ly2/Z;

    if-eqz v1, :cond_0

    check-cast v0, Ly2/Z;

    invoke-virtual {v0}, Ly2/Z;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    new-instance p1, Ly2/T;

    invoke-virtual {p0}, Ly2/a;->D()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Ly2/T;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ly2/b0;)V

    :cond_1
    invoke-virtual {p0, p1}, LA2/n;->B(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final a0(Ljava/lang/Throwable;Z)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, LA2/n;->g:LA2/b;

    invoke-virtual {v1, p1, v0}, LA2/b;->g(Ljava/lang/Throwable;Z)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    iget-object p2, p0, Ly2/a;->f:Lg2/i;

    invoke-static {p2, p1}, Ly2/v;->h(Lg2/i;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final b0(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lc2/m;

    const/4 p1, 0x0

    iget-object v0, p0, LA2/n;->g:LA2/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, LA2/b;->g(Ljava/lang/Throwable;Z)Z

    return-void
.end method

.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p1, Lc2/m;->a:Lc2/m;

    iget-object v0, p0, LA2/n;->g:LA2/b;

    invoke-interface {v0, p1}, LA2/q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final p(Lg2/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LA2/n;->g:LA2/b;

    invoke-interface {v0, p1, p2}, LA2/q;->p(Lg2/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

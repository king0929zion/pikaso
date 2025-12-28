.class public final Ly2/c0;
.super Ly2/h0;
.source "SourceFile"


# instance fields
.field public final g:Lg2/d;


# direct methods
.method public constructor <init>(Lg2/i;Lo2/e;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ly2/a;-><init>(Lg2/i;Z)V

    invoke-static {p0, p0, p2}, LZ/b;->n(Lg2/d;Lg2/d;Lo2/e;)Lg2/d;

    move-result-object p1

    iput-object p1, p0, Ly2/c0;->g:Lg2/d;

    return-void
.end method


# virtual methods
.method public final V()V
    .locals 3

    iget-object v0, p0, Ly2/c0;->g:Lg2/d;

    :try_start_0
    invoke-static {v0}, LZ/b;->z(Lg2/d;)Lg2/d;

    move-result-object v0

    sget-object v1, Lc2/m;->a:Lc2/m;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, LD2/a;->h(Lg2/d;Ljava/lang/Object;Lo2/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, LZ0/d;->q(Ljava/lang/Throwable;)Lc2/i;

    move-result-object v1

    invoke-virtual {p0, v1}, Ly2/a;->t(Ljava/lang/Object;)V

    throw v0
.end method

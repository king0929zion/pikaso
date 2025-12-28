.class public final Lq/w;
.super LP/k;
.source "SourceFile"

# interfaces
.implements Ln0/o0;
.implements Ln0/l;


# static fields
.field public static final s:Lq/I;


# instance fields
.field public q:Z

.field public r:Ln0/Y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq/I;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq/w;->s:Lq/I;

    return-void
.end method


# virtual methods
.method public final V()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lq/w;->s:Lq/I;

    return-object v0
.end method

.method public final p(Ln0/Y;)V
    .locals 1

    iput-object p1, p0, Lq/w;->r:Ln0/Y;

    iget-boolean v0, p0, Lq/w;->q:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ln0/Y;->q0()LP/k;

    move-result-object p1

    iget-boolean p1, p1, LP/k;->p:Z

    sget-object v0, Lq/x;->q:Lq/I;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lq/w;->r:Ln0/Y;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ln0/Y;->q0()LP/k;

    move-result-object p1

    iget-boolean p1, p1, LP/k;->p:Z

    if-eqz p1, :cond_2

    iget-boolean p1, p0, LP/k;->p:Z

    if-eqz p1, :cond_2

    invoke-static {p0, v0}, Ln0/C;->i(Ln0/h;Ljava/lang/Object;)Ln0/o0;

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, LP/k;->p:Z

    if-eqz p1, :cond_2

    invoke-static {p0, v0}, Ln0/C;->i(Ln0/h;Ljava/lang/Object;)Ln0/o0;

    :cond_2
    :goto_0
    return-void
.end method

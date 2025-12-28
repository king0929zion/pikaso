.class public final Ly2/Y;
.super Ly2/W;
.source "SourceFile"


# instance fields
.field public final h:Ly2/b0;

.field public final i:Ly2/Z;

.field public final j:Ly2/j;

.field public final k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ly2/b0;Ly2/Z;Ly2/j;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, LD2/k;-><init>()V

    iput-object p1, p0, Ly2/Y;->h:Ly2/b0;

    iput-object p2, p0, Ly2/Y;->i:Ly2/Z;

    iput-object p3, p0, Ly2/Y;->j:Ly2/j;

    iput-object p4, p0, Ly2/Y;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ly2/Y;->p(Ljava/lang/Throwable;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method

.method public final p(Ljava/lang/Throwable;)V
    .locals 7

    iget-object p1, p0, Ly2/Y;->j:Ly2/j;

    iget-object v0, p0, Ly2/Y;->h:Ly2/b0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ly2/b0;->S(LD2/k;)Ly2/j;

    move-result-object p1

    iget-object v1, p0, Ly2/Y;->i:Ly2/Z;

    iget-object v2, p0, Ly2/Y;->k:Ljava/lang/Object;

    if-eqz p1, :cond_2

    :cond_0
    iget-object v3, p1, Ly2/j;->h:Ly2/b0;

    new-instance v4, Ly2/Y;

    invoke-direct {v4, v0, v1, p1, v2}, Ly2/Y;-><init>(Ly2/b0;Ly2/Z;Ly2/j;Ljava/lang/Object;)V

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v3, v5, v4, v6}, Ly2/v;->i(Ly2/S;ZLy2/W;I)Ly2/C;

    move-result-object v3

    sget-object v4, Ly2/e0;->d:Ly2/e0;

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ly2/b0;->S(LD2/k;)Ly2/j;

    move-result-object p1

    if-nez p1, :cond_0

    :cond_2
    invoke-virtual {v0, v1, v2}, Ly2/b0;->H(Ly2/Z;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ly2/b0;->y(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

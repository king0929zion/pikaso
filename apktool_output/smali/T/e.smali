.class public abstract Lt/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/HashMap;

.field public static final b:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lt/e;->b(Z)Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lt/e;->a:Ljava/util/HashMap;

    const/4 v0, 0x0

    invoke-static {v0}, Lt/e;->b(Z)Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lt/e;->b:Ljava/util/HashMap;

    return-void
.end method

.method public static final a(Ll0/n;Ll0/o;Ll0/j;LG0/f;IILP/d;)V
    .locals 6

    invoke-interface {p2}, Ll0/j;->o()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lt/d;

    if-eqz v0, :cond_0

    check-cast p2, Lt/d;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_2

    iget-object p2, p2, Lt/d;->q:LP/d;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p2

    goto :goto_2

    :cond_2
    :goto_1
    move-object v0, p6

    :goto_2
    iget p2, p1, Ll0/o;->d:I

    iget p6, p1, Ll0/o;->e:I

    invoke-static {p2, p6}, Lr2/a;->d(II)J

    move-result-wide v1

    invoke-static {p4, p5}, Lr2/a;->d(II)J

    move-result-wide v3

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, LP/d;->a(JJLG0/f;)J

    move-result-wide p2

    invoke-static {p0, p1, p2, p3}, Ll0/n;->e(Ll0/n;Ll0/o;J)V

    return-void
.end method

.method public static final b(Z)Ljava/util/HashMap;
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sget-object v1, LP/a;->d:LP/d;

    invoke-static {v0, p0, v1}, Lt/e;->c(Ljava/util/HashMap;ZLP/d;)V

    sget-object v1, LP/a;->e:LP/d;

    invoke-static {v0, p0, v1}, Lt/e;->c(Ljava/util/HashMap;ZLP/d;)V

    sget-object v1, LP/a;->f:LP/d;

    invoke-static {v0, p0, v1}, Lt/e;->c(Ljava/util/HashMap;ZLP/d;)V

    sget-object v1, LP/a;->g:LP/d;

    invoke-static {v0, p0, v1}, Lt/e;->c(Ljava/util/HashMap;ZLP/d;)V

    sget-object v1, LP/a;->h:LP/d;

    invoke-static {v0, p0, v1}, Lt/e;->c(Ljava/util/HashMap;ZLP/d;)V

    sget-object v1, LP/a;->i:LP/d;

    invoke-static {v0, p0, v1}, Lt/e;->c(Ljava/util/HashMap;ZLP/d;)V

    sget-object v1, LP/a;->j:LP/d;

    invoke-static {v0, p0, v1}, Lt/e;->c(Ljava/util/HashMap;ZLP/d;)V

    sget-object v1, LP/a;->k:LP/d;

    invoke-static {v0, p0, v1}, Lt/e;->c(Ljava/util/HashMap;ZLP/d;)V

    sget-object v1, LP/a;->l:LP/d;

    invoke-static {v0, p0, v1}, Lt/e;->c(Ljava/util/HashMap;ZLP/d;)V

    return-object v0
.end method

.method public static final c(Ljava/util/HashMap;ZLP/d;)V
    .locals 1

    new-instance v0, Lt/i;

    invoke-direct {v0, p2, p1}, Lt/i;-><init>(LP/d;Z)V

    invoke-virtual {p0, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final d(Z)Ll0/k;
    .locals 2

    sget-object v0, LP/a;->d:LP/d;

    if-eqz p0, :cond_0

    sget-object v1, Lt/e;->a:Ljava/util/HashMap;

    goto :goto_0

    :cond_0
    sget-object v1, Lt/e;->b:Ljava/util/HashMap;

    :goto_0
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll0/k;

    if-nez v1, :cond_1

    new-instance v1, Lt/i;

    invoke-direct {v1, v0, p0}, Lt/i;-><init>(LP/d;Z)V

    :cond_1
    return-object v1
.end method

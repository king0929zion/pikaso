.class public final LM0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/HashSet;

.field public final b:LM0/d;

.field public final c:I

.field public d:LM0/c;

.field public e:I

.field public f:I

.field public g:LL0/j;


# direct methods
.method public constructor <init>(LM0/d;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LM0/c;->a:Ljava/util/HashSet;

    const/4 v0, 0x0

    iput v0, p0, LM0/c;->e:I

    const/4 v0, -0x1

    iput v0, p0, LM0/c;->f:I

    iput-object p1, p0, LM0/c;->b:LM0/d;

    iput p2, p0, LM0/c;->c:I

    return-void
.end method


# virtual methods
.method public final a(LM0/c;I)V
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, LM0/c;->b(LM0/c;IIZ)Z

    return-void
.end method

.method public final b(LM0/c;IIZ)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-virtual {p0}, LM0/c;->h()V

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p4, :cond_1

    invoke-virtual {p0, p1}, LM0/c;->g(LM0/c;)Z

    move-result p4

    if-nez p4, :cond_1

    return v1

    :cond_1
    iput-object p1, p0, LM0/c;->d:LM0/c;

    iget-object p4, p1, LM0/c;->a:Ljava/util/HashSet;

    if-nez p4, :cond_2

    new-instance p4, Ljava/util/HashSet;

    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    iput-object p4, p1, LM0/c;->a:Ljava/util/HashSet;

    :cond_2
    iget-object p1, p0, LM0/c;->d:LM0/c;

    iget-object p1, p1, LM0/c;->a:Ljava/util/HashSet;

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-lez p2, :cond_3

    iput p2, p0, LM0/c;->e:I

    goto :goto_0

    :cond_3
    iput v1, p0, LM0/c;->e:I

    :goto_0
    iput p3, p0, LM0/c;->f:I

    return v0
.end method

.method public final c()I
    .locals 3

    iget-object v0, p0, LM0/c;->b:LM0/d;

    iget v0, v0, LM0/d;->V:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, LM0/c;->f:I

    const/4 v2, -0x1

    if-le v0, v2, :cond_1

    iget-object v2, p0, LM0/c;->d:LM0/c;

    if-eqz v2, :cond_1

    iget-object v2, v2, LM0/c;->b:LM0/d;

    iget v2, v2, LM0/d;->V:I

    if-ne v2, v1, :cond_1

    return v0

    :cond_1
    iget v0, p0, LM0/c;->e:I

    return v0
.end method

.method public final d()LM0/c;
    .locals 3

    iget v0, p0, LM0/c;->c:I

    invoke-static {v0}, Lp/f;->b(I)I

    move-result v1

    iget-object v2, p0, LM0/c;->b:LM0/d;

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-static {v0}, LA/a;->m(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :pswitch_0
    iget-object v0, v2, LM0/d;->y:LM0/c;

    return-object v0

    :pswitch_1
    iget-object v0, v2, LM0/d;->x:LM0/c;

    return-object v0

    :pswitch_2
    iget-object v0, v2, LM0/d;->A:LM0/c;

    return-object v0

    :pswitch_3
    iget-object v0, v2, LM0/d;->z:LM0/c;

    return-object v0

    :pswitch_4
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public final e()Z
    .locals 3

    iget-object v0, p0, LM0/c;->a:Ljava/util/HashSet;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LM0/c;

    invoke-virtual {v2}, LM0/c;->d()LM0/c;

    move-result-object v2

    invoke-virtual {v2}, LM0/c;->f()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, LM0/c;->d:LM0/c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g(LM0/c;)Z
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x6

    iget v2, p0, LM0/c;->c:I

    const/4 v3, 0x1

    iget-object v4, p1, LM0/c;->b:LM0/d;

    iget p1, p1, LM0/c;->c:I

    if-ne p1, v2, :cond_3

    if-ne v2, v1, :cond_2

    iget-boolean p1, v4, LM0/d;->w:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, LM0/c;->b:LM0/d;

    iget-boolean p1, p1, LM0/d;->w:Z

    if-nez p1, :cond_2

    :cond_1
    return v0

    :cond_2
    return v3

    :cond_3
    invoke-static {v2}, Lp/f;->b(I)I

    move-result v5

    const/16 v6, 0x8

    const/16 v7, 0x9

    packed-switch v5, :pswitch_data_0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-static {v2}, LA/a;->m(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_0
    if-eq p1, v1, :cond_4

    if-eq p1, v6, :cond_4

    if-eq p1, v7, :cond_4

    move v0, v3

    :cond_4
    return v0

    :pswitch_1
    const/4 v1, 0x3

    if-eq p1, v1, :cond_6

    const/4 v1, 0x5

    if-ne p1, v1, :cond_5

    goto :goto_0

    :cond_5
    move v1, v0

    goto :goto_1

    :cond_6
    :goto_0
    move v1, v3

    :goto_1
    instance-of v2, v4, LM0/h;

    if-eqz v2, :cond_9

    if-nez v1, :cond_7

    if-ne p1, v7, :cond_8

    :cond_7
    move v0, v3

    :cond_8
    move v1, v0

    :cond_9
    return v1

    :pswitch_2
    const/4 v1, 0x2

    if-eq p1, v1, :cond_b

    const/4 v1, 0x4

    if-ne p1, v1, :cond_a

    goto :goto_2

    :cond_a
    move v1, v0

    goto :goto_3

    :cond_b
    :goto_2
    move v1, v3

    :goto_3
    instance-of v2, v4, LM0/h;

    if-eqz v2, :cond_e

    if-nez v1, :cond_c

    if-ne p1, v6, :cond_d

    :cond_c
    move v0, v3

    :cond_d
    move v1, v0

    :cond_e
    return v1

    :pswitch_3
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, LM0/c;->d:LM0/c;

    if-eqz v0, :cond_0

    iget-object v0, v0, LM0/c;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LM0/c;->d:LM0/c;

    const/4 v0, 0x0

    iput v0, p0, LM0/c;->e:I

    const/4 v0, -0x1

    iput v0, p0, LM0/c;->f:I

    return-void
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, LM0/c;->g:LL0/j;

    if-nez v0, :cond_0

    new-instance v0, LL0/j;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LL0/j;-><init>(I)V

    iput-object v0, p0, LM0/c;->g:LL0/j;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LL0/j;->c()V

    :goto_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LM0/c;->b:LM0/d;

    iget-object v1, v1, LM0/d;->W:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LM0/c;->c:I

    invoke-static {v1}, LA/a;->m(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

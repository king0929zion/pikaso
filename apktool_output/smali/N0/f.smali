.class public LN0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN0/d;


# instance fields
.field public a:LN0/m;

.field public b:Z

.field public c:Z

.field public final d:LN0/m;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:LN0/g;

.field public j:Z

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(LN0/m;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LN0/f;->a:LN0/m;

    const/4 v1, 0x0

    iput-boolean v1, p0, LN0/f;->b:Z

    iput-boolean v1, p0, LN0/f;->c:Z

    const/4 v2, 0x1

    iput v2, p0, LN0/f;->e:I

    iput v2, p0, LN0/f;->h:I

    iput-object v0, p0, LN0/f;->i:LN0/g;

    iput-boolean v1, p0, LN0/f;->j:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LN0/f;->k:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LN0/f;->l:Ljava/util/ArrayList;

    iput-object p1, p0, LN0/f;->d:LN0/m;

    return-void
.end method


# virtual methods
.method public final a(LN0/d;)V
    .locals 5

    iget-object p1, p0, LN0/f;->l:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LN0/f;

    iget-boolean v1, v1, LN0/f;->j:Z

    if-nez v1, :cond_0

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, LN0/f;->c:Z

    iget-object v1, p0, LN0/f;->a:LN0/m;

    if-eqz v1, :cond_2

    invoke-interface {v1, p0}, LN0/d;->a(LN0/d;)V

    :cond_2
    iget-boolean v1, p0, LN0/f;->b:Z

    if-eqz v1, :cond_3

    iget-object p1, p0, LN0/f;->d:LN0/m;

    invoke-interface {p1, p0}, LN0/d;->a(LN0/d;)V

    return-void

    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LN0/f;

    instance-of v4, v3, LN0/g;

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    add-int/lit8 v2, v2, 0x1

    move-object v1, v3

    goto :goto_0

    :cond_5
    if-eqz v1, :cond_8

    if-ne v2, v0, :cond_8

    iget-boolean p1, v1, LN0/f;->j:Z

    if-eqz p1, :cond_8

    iget-object p1, p0, LN0/f;->i:LN0/g;

    if-eqz p1, :cond_7

    iget-boolean v0, p1, LN0/f;->j:Z

    if-eqz v0, :cond_6

    iget v0, p0, LN0/f;->h:I

    iget p1, p1, LN0/f;->g:I

    mul-int/2addr v0, p1

    iput v0, p0, LN0/f;->f:I

    goto :goto_1

    :cond_6
    return-void

    :cond_7
    :goto_1
    iget p1, v1, LN0/f;->g:I

    iget v0, p0, LN0/f;->f:I

    add-int/2addr p1, v0

    invoke-virtual {p0, p1}, LN0/f;->d(I)V

    :cond_8
    iget-object p1, p0, LN0/f;->a:LN0/m;

    if-eqz p1, :cond_9

    invoke-interface {p1, p0}, LN0/d;->a(LN0/d;)V

    :cond_9
    return-void
.end method

.method public final b(LN0/m;)V
    .locals 1

    iget-object v0, p0, LN0/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, LN0/f;->j:Z

    if-eqz v0, :cond_0

    invoke-interface {p1, p1}, LN0/d;->a(LN0/d;)V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, LN0/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, LN0/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LN0/f;->j:Z

    iput v0, p0, LN0/f;->g:I

    iput-boolean v0, p0, LN0/f;->c:Z

    iput-boolean v0, p0, LN0/f;->b:Z

    return-void
.end method

.method public d(I)V
    .locals 1

    iget-boolean v0, p0, LN0/f;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LN0/f;->j:Z

    iput p1, p0, LN0/f;->g:I

    iget-object p1, p0, LN0/f;->k:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN0/d;

    invoke-interface {v0, v0}, LN0/d;->a(LN0/d;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LN0/f;->d:LN0/m;

    iget-object v1, v1, LN0/m;->b:LM0/d;

    iget-object v1, v1, LM0/d;->W:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LN0/f;->e:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "null"

    goto :goto_0

    :pswitch_0
    const-string v1, "BASELINE"

    goto :goto_0

    :pswitch_1
    const-string v1, "BOTTOM"

    goto :goto_0

    :pswitch_2
    const-string v1, "TOP"

    goto :goto_0

    :pswitch_3
    const-string v1, "RIGHT"

    goto :goto_0

    :pswitch_4
    const-string v1, "LEFT"

    goto :goto_0

    :pswitch_5
    const-string v1, "VERTICAL_DIMENSION"

    goto :goto_0

    :pswitch_6
    const-string v1, "HORIZONTAL_DIMENSION"

    goto :goto_0

    :pswitch_7
    const-string v1, "UNKNOWN"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LN0/f;->j:Z

    if-eqz v1, :cond_0

    iget v1, p0, LN0/f;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    :cond_0
    const-string v1, "unresolved"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") <t="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LN0/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":d="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LN0/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

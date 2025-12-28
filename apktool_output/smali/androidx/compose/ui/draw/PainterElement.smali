.class final Landroidx/compose/ui/draw/PainterElement;
.super Ln0/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;"
    }
.end annotation


# instance fields
.field public final a:Lb0/b;

.field public final b:Z

.field public final c:LP/d;

.field public final d:Ll0/d;

.field public final e:F

.field public final f:LW/l;


# direct methods
.method public constructor <init>(Lb0/b;ZLP/d;Ll0/d;FLW/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/draw/PainterElement;->a:Lb0/b;

    iput-boolean p2, p0, Landroidx/compose/ui/draw/PainterElement;->b:Z

    iput-object p3, p0, Landroidx/compose/ui/draw/PainterElement;->c:LP/d;

    iput-object p4, p0, Landroidx/compose/ui/draw/PainterElement;->d:Ll0/d;

    iput p5, p0, Landroidx/compose/ui/draw/PainterElement;->e:F

    iput-object p6, p0, Landroidx/compose/ui/draw/PainterElement;->f:LW/l;

    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 2

    new-instance v0, LT/c;

    invoke-direct {v0}, LP/k;-><init>()V

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->a:Lb0/b;

    iput-object v1, v0, LT/c;->q:Lb0/b;

    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterElement;->b:Z

    iput-boolean v1, v0, LT/c;->r:Z

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->c:LP/d;

    iput-object v1, v0, LT/c;->s:LP/d;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->d:Ll0/d;

    iput-object v1, v0, LT/c;->t:Ll0/d;

    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->e:F

    iput v1, v0, LT/c;->u:F

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->f:LW/l;

    iput-object v1, v0, LT/c;->v:LW/l;

    return-object v0
.end method

.method public final e(LP/k;)V
    .locals 7

    check-cast p1, LT/c;

    iget-boolean v0, p1, LT/c;->r:Z

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->a:Lb0/b;

    iget-boolean v2, p0, Landroidx/compose/ui/draw/PainterElement;->b:Z

    if-ne v0, v2, :cond_1

    if-eqz v2, :cond_0

    iget-object v0, p1, LT/c;->q:Lb0/b;

    invoke-virtual {v0}, Lb0/b;->d()J

    move-result-wide v3

    invoke-virtual {v1}, Lb0/b;->d()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, LV/f;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-object v1, p1, LT/c;->q:Lb0/b;

    iput-boolean v2, p1, LT/c;->r:Z

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->c:LP/d;

    iput-object v1, p1, LT/c;->s:LP/d;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->d:Ll0/d;

    iput-object v1, p1, LT/c;->t:Ll0/d;

    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->e:F

    iput v1, p1, LT/c;->u:F

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->f:LW/l;

    iput-object v1, p1, LT/c;->v:LW/l;

    if-eqz v0, :cond_2

    invoke-static {p1}, Ln0/C;->l(Ln0/s;)V

    :cond_2
    invoke-static {p1}, Ln0/C;->k(Ln0/k;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/draw/PainterElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/draw/PainterElement;

    iget-object v1, p1, Landroidx/compose/ui/draw/PainterElement;->a:Lb0/b;

    iget-object v3, p0, Landroidx/compose/ui/draw/PainterElement;->a:Lb0/b;

    invoke-static {v3, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterElement;->b:Z

    iget-boolean v3, p1, Landroidx/compose/ui/draw/PainterElement;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->c:LP/d;

    iget-object v3, p1, Landroidx/compose/ui/draw/PainterElement;->c:LP/d;

    invoke-static {v1, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->d:Ll0/d;

    iget-object v3, p1, Landroidx/compose/ui/draw/PainterElement;->d:Ll0/d;

    invoke-static {v1, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->e:F

    iget v3, p1, Landroidx/compose/ui/draw/PainterElement;->e:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->f:LW/l;

    iget-object p1, p1, Landroidx/compose/ui/draw/PainterElement;->f:LW/l;

    invoke-static {v1, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/draw/PainterElement;->a:Lb0/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Landroidx/compose/ui/draw/PainterElement;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Landroidx/compose/ui/draw/PainterElement;->c:LP/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/ui/draw/PainterElement;->d:Ll0/d;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Landroidx/compose/ui/draw/PainterElement;->e:F

    invoke-static {v0, v2, v1}, Lp/f;->a(FII)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->f:LW/l;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, LW/l;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PainterElement(painter="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->a:Lb0/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sizeToIntrinsics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterElement;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", alignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->c:LP/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->d:Ll0/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", colorFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->f:LW/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

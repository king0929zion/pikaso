.class public abstract Lb1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LM1/d;

.field public static final b:LM1/d;

.field public static final c:LM1/d;

.field public static final d:LM1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LM1/d;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LM1/d;-><init>(Lb1/e;Z)V

    sput-object v0, Lb1/f;->a:LM1/d;

    new-instance v0, LM1/d;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, LM1/d;-><init>(Lb1/e;Z)V

    sput-object v0, Lb1/f;->b:LM1/d;

    new-instance v0, LM1/d;

    sget-object v1, Lb1/e;->a:Lb1/e;

    invoke-direct {v0, v1, v2}, LM1/d;-><init>(Lb1/e;Z)V

    sput-object v0, Lb1/f;->c:LM1/d;

    new-instance v0, LM1/d;

    invoke-direct {v0, v1, v3}, LM1/d;-><init>(Lb1/e;Z)V

    sput-object v0, Lb1/f;->d:LM1/d;

    return-void
.end method

.class public final LM/d;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/a;


# static fields
.field public static final e:LM/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp2/h;-><init>(I)V

    sput-object v0, LM/d;->e:LM/d;

    return-void
.end method


# virtual methods
.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
